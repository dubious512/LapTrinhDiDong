package com.laptrinhandroid.on_thi_gplx.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laptrinhandroid.on_thi_gplx.R;
import com.laptrinhandroid.on_thi_gplx.adapter.MeoAdapter;
import com.laptrinhandroid.on_thi_gplx.model.Meo;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeoLyThuyetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeoLyThuyetFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MeoLyThuyetFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeoLyThuyetFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeoLyThuyetFragment newInstance(String param1, String param2) {
        MeoLyThuyetFragment fragment = new MeoLyThuyetFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meo_ly_thuyet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.listMeoLyThuyet);
        List<Meo> list = Meo.initMeoLyThuyet();
        MeoAdapter adapter = new MeoAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }
}
