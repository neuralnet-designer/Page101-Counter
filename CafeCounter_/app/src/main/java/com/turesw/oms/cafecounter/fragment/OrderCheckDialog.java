package com.turesw.oms.cafecounter.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.turesw.oms.cafecounter.R;


/**
 * Created by OMS on 2015-10-13.
 */
public class OrderCheckDialog extends DialogFragment {
    int table_num;
    int tableNum = 0;
    String dialogTile = "";
    Button buttonCall;
    Button buttonEnd;
    Button buttonCancel;


    // 리스너 인터페이스 선언
    public interface OrderCheckDialogListener {
        public void onTestDialogClick(DialogFragment dialog, int table_num);
    }
    OrderCheckDialogListener orderCheckDialogListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            orderCheckDialogListener = (OrderCheckDialogListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement TestDialogFragmentListener");
        }
    }

    // 리스너 인터페이스 속의 메서드 작동(연결된 액티비티와 통신)
    public void someAction() {
        orderCheckDialogListener.onTestDialogClick(
                OrderCheckDialog.this, table_num);
    }

    public OrderCheckDialog() {
    }

    public void getTableNum(int num){
        tableNum = num;
    }

    public void setTitle(String title){
        dialogTile = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.setprojectdialog, container);
        getDialog().setTitle(dialogTile);
        buttonCancel = (Button) view.findViewById(R.id.button_cancel);
        buttonCall = (Button) view.findViewById(R.id.button_call);
        buttonEnd = (Button) view.findViewById(R.id.button_end);

        buttonEnd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                OrderCheckDialog.this.dismiss();
            }
        });

        return view;

    }


}
