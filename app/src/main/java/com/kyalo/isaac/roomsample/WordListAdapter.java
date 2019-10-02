package com.kyalo.isaac.roomsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter
        .WordViewHolder> implements AdapterView.OnItemClickListener {

    private final LayoutInflater mInflater;
    private List<Word> mWords; // Cached copy of words
    static  int dataSize;

    WordListAdapter(Context context) { mInflater = LayoutInflater
            .from(context); }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        if (mWords != null) {
            Word current = mWords.get(position);
            holder.wordItemView.setText(current.getWord());
            holder.locationView.setText(current.getLocation());
        } else {
            // Covers the case of data not being ready yet.
            holder.wordItemView.setText("No Word");

        }
    }

    void setWords(List<Word> words){
        mWords = words;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (mWords != null) {
            dataSize = mWords.size();
            return mWords.size();
        }
        else return 0;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    class WordViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordItemView;
        private  final TextView locationView;

        private WordViewHolder(View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.textView);
            locationView = itemView.findViewById(R.id.location_tv);
        }
    }

    public Word getWordAtPosition (int position) {
        return mWords.get(position);
    }

    public static int itemsize()
    {
        return dataSize;
    }

}