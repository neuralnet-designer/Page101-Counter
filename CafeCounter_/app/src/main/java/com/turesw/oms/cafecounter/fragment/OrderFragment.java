package com.turesw.oms.cafecounter.fragment;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.turesw.oms.cafecounter.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OrderFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OrderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderFragment extends Fragment implements OrderCheckDialog.OrderCheckDialogListener{
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_PARAM1 = "param1";
	private static final String ARG_PARAM2 = "param2";

	// TODO: Rename and change types of parameters
	private String mParam1;
	private String mParam2;

	ArrayList<Button> button = new ArrayList<>();

	private OnFragmentInteractionListener mListener;

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @param param1 Parameter 1.
	 * @param param2 Parameter 2.
	 * @return A new instance of fragment BlankFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static BlankFragment newInstance(String param1, String param2) {
		BlankFragment fragment = new BlankFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	public OrderFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			mParam1 = getArguments().getString(ARG_PARAM1);
			mParam2 = getArguments().getString(ARG_PARAM2);
		}

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View rootView = inflater.inflate(R.layout.fragment_order, container, false);




		button.add((Button) rootView.findViewById(R.id.button1));
		button.add((Button) rootView.findViewById(R.id.button2));
		button.add((Button) rootView.findViewById(R.id.button3));
		button.add((Button) rootView.findViewById(R.id.button4));
		button.add((Button) rootView.findViewById(R.id.button5));
		button.add((Button) rootView.findViewById(R.id.button6));
		button.add((Button) rootView.findViewById(R.id.button7));
		button.add((Button) rootView.findViewById(R.id.button8));
		button.add((Button) rootView.findViewById(R.id.button9));
		button.add((Button) rootView.findViewById(R.id.button10));
		button.add((Button) rootView.findViewById(R.id.button11));
		button.add((Button) rootView.findViewById(R.id.button12));
		button.add((Button) rootView.findViewById(R.id.button13));
		button.add((Button) rootView.findViewById(R.id.button14));
		button.add((Button) rootView.findViewById(R.id.button15));
		button.add((Button) rootView.findViewById(R.id.button16));
		button.add((Button) rootView.findViewById(R.id.button17));
		button.add((Button) rootView.findViewById(R.id.button18));
		button.add((Button) rootView.findViewById(R.id.button19));
		button.add((Button) rootView.findViewById(R.id.button20));
		button.add((Button) rootView.findViewById(R.id.button21));
		button.add((Button) rootView.findViewById(R.id.button22));
		button.add((Button) rootView.findViewById(R.id.button23));
		button.add((Button) rootView.findViewById(R.id.button24));
		button.add((Button) rootView.findViewById(R.id.button25));
		button.add((Button) rootView.findViewById(R.id.button26));

		for(int i = 0; i < 26; i++) {
			button.get(i).setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					for(int i = 0; i < 26; i++){
						if(view == button.get(i)) {
							android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
							OrderCheckDialog setProjectDialog = new OrderCheckDialog();
							setProjectDialog.getTableNum(i + 1);
							setProjectDialog.setTitle((i + 1) + "번 테이블 주문확인");
							setProjectDialog.show(fm, "테이블 위치");
						}
					}
				}
			});
		}

		return rootView;
	}

	// TODO: Rename method, update argument and hook method into UI event
	public void onButtonPressed(Uri uri) {
		if (mListener != null) {
			mListener.onFragmentInteraction(uri);
		}
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mListener = (OnFragmentInteractionListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnFragmentInteractionListener");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mListener = null;
	}

	@Override
	public void onTestDialogClick(DialogFragment dialog, int table_num) {

	}

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated
	 * to the activity and potentially other fragments contained in that
	 * activity.
	 * <p>
	 * See the Android Training lesson <a href=
	 * "http://developer.android.com/training/basics/fragments/communicating.html"
	 * >Communicating with Other Fragments</a> for more information.
	 */
	public interface OnFragmentInteractionListener {
		// TODO: Update argument type and name
		public void onFragmentInteraction(Uri uri);
	}

}

