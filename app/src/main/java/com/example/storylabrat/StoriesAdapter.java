package com.example.storylabrat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder> {

    private List<Story> stories;
    public Context context;

    public StoriesAdapter(List<Story> stories,Context context){

        this.stories= stories;
        this.context= context;
    }

    @NonNull
    @Override
    public StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.story_item,parent,false);

        StoriesViewHolder viewHolder = new StoriesViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesViewHolder holder, int position) {

        if(stories.get(position).isSeen()){
            holder.storyOutLine.setCardBackgroundColor(context.getResources().getColor(R.color.grey));

        }

    }



    @Override
    public int getItemCount() {
        return stories.size();
    }

    public static class StoriesViewHolder extends RecyclerView.ViewHolder{

        private CardView storyOutLine;


        public StoriesViewHolder(@NonNull View itemView) {

            super(itemView);

            storyOutLine=   itemView.findViewById(R.id.storyOutline);

        }


    }

}
