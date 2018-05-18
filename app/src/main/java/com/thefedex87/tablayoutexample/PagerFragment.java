package com.thefedex87.tablayoutexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by federico.creti on 18/05/2018.
 */

public class PagerFragment extends Fragment {
    private String title;
    private int page;

    public static PagerFragment newInstance(String title, int page){
        PagerFragment pagerFragment = new PagerFragment();
        Bundle b = new Bundle();
        b.putString("title", title);
        b.putInt("page", page);
        pagerFragment.setArguments(b);
        return pagerFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        title = getArguments().getString("title");
        page = getArguments().getInt("page", 0);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout, container, false);
        TextView title = v.findViewById(R.id.title);
        title.setText(this.title + "-----" + "Pagina: " + page);
        return v;
    }
}
