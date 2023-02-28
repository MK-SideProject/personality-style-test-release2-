package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BankingTest_2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BankingTest_2 extends Fragment {


    //결과값 이동
    private String bankingtest_result1;
    private String bankingtest_result2;
    private String bankingtest_result3;
    public BankingTest_2() {
        // Required empty public constructor
    }


    public static BankingTest_2 newInstance(String param1, String param2) {
        BankingTest_2 fragment = new BankingTest_2();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View BankingTest2 = inflater.inflate(R.layout.fragment_bankingtest_2, container, false);

        Button bankingtest_2_an1 = (Button) BankingTest2.findViewById(R.id.bankingtest_2_an1);
        Button bankingtest_2_an2 = (Button) BankingTest2.findViewById(R.id.bankingtest_2_an2);
        Button bankingtest_2_an3 = (Button) BankingTest2.findViewById(R.id.bankingtest_2_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if(bundle != null){
            bankingtest_result1 = bundle.getString("bankingtest_result1");
            bankingtest_result2 = bundle.getString("bankingtest_result2");
            bankingtest_result3 = bundle.getString("bankingtest_result3");


            //데이터 전달 및 프래그먼트 변경
            BankingTest_3 bankingTest_3 = new BankingTest_3();
            //전달할 번들 생성
            Bundle bundle_next = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            //버튼 1번 클릭
            bankingtest_2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundle_next.putString("bankingtest_result1",bankingtest_result1);
                    bundle_next.putString("bankingtest_result2",bankingtest_result2);
                    bundle_next.putString("bankingtest_result3",bankingtest_result3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_3.setArguments(bundle_next);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_3);

                    transaction.commit();


                }
            });

            //2번 버튼 클릭
            bankingtest_2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundle_next.putString("bankingtest_result1",bankingtest_result1);
                    bundle_next.putString("bankingtest_result2",bankingtest_result2);
                    bundle_next.putString("bankingtest_result3",bankingtest_result3);
                    bankingTest_3.setArguments(bundle_next);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_3);

                    transaction.commit();
                }
            });

            //3번 버튼 클릭
            bankingtest_2_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundle_next.putString("bankingtest_result1",bankingtest_result1);
                    bundle_next.putString("bankingtest_result2",bankingtest_result2);
                    bundle_next.putString("bankingtest_result3",bankingtest_result3);
                    bankingTest_3.setArguments(bundle_next);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_3);

                    transaction.commit();
                }
            });


        }

        bankingtest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //데이터 전달 및 프래그먼트 변경
                BankingTest_3 bankingTest_3 = new BankingTest_3();
                //전달할 번들 생성
                Bundle bundle_next = new Bundle();
                //번틀 값 설정
                bundle_next.putString("bankingtest_result1",bankingtest_result1);
                bundle_next.putString("bankingtest_result2",bankingtest_result2);
                bundle_next.putString("bankingtest_result3",bankingtest_result3);
                bankingTest_3.setArguments(bundle_next);

                //프래그먼트 이동 선언
                FragmentManager mnger = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = mnger.beginTransaction();
                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingTest_3);

                transaction.commit();


            }
        });


        return BankingTest2;
    }

}