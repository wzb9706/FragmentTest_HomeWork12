package com.example.wzb97.fragmenttest_homework12;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wzb97.fragmenttest_homework12.words.WordContent;


public class MainActivity extends Activity implements ItemFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(WordContent.WordItem item) {
        Bundle arguments =new Bundle();
        arguments.putString("id",item.id);
        DetailFragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
