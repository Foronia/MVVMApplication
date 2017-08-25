package com.simple.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simple.mvvm.BR;
import com.simple.mvvm.R;
import com.simple.viewModel.Student;

import java.util.ArrayList;

/**
 * Created by qijie07 on 2016/12/3.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

        private ArrayList<Student> mData = new ArrayList<>();

        public RecyclerViewAdapter(ArrayList<Student> data) {
            mData.addAll(data);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater
                    .from(viewGroup.getContext()), R.layout.pull_item, viewGroup, false);
            ViewHolder holder = new ViewHolder(binding.getRoot());
            holder.setBinding(binding);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            viewHolder.getBinding().setVariable(BR.stu, mData.get(i));
            viewHolder.getBinding().executePendingBindings();
        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            private ViewDataBinding binding;

            public ViewHolder(View itemView) {
                super(itemView);
            }

            public void setBinding(ViewDataBinding binding) {
                this.binding = binding;
            }

            public ViewDataBinding getBinding() {
                return this.binding;
            }
        }

}
