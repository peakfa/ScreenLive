package zmartec.screenlive.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import zmartec.screenlive.R;

/**
 * Created by Peakfa on 2016/12/16 14:55
 * E-mail：peakfa@163.com
 * company: Zmartec
 */
public class MuktiWindowAdapter extends RecyclerView.Adapter<MuktiWindowAdapter.ViewHolder>{
    private MyItemClickListener mItemClickListener;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mulite_window, parent, false);
        ViewHolder vh = new ViewHolder(view, mItemClickListener);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mList_item.setId(position);

    }

    @Override
    public int getItemCount() {
        return 4;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        MyItemClickListener mListener;
        private  TextureView mList_item;

        public ViewHolder(View itemView, MyItemClickListener myItemClickListener) {
            super(itemView);
            mList_item = (TextureView) itemView.findViewById(R.id.list_item);
            this.mListener = myItemClickListener;
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View view) {
            if (mListener != null) {
                mListener.onItemClick(view, getAdapterPosition());
            }
        }


    }

    /**
     * 设置Item点击监听
     *
     * @param listener
     */
    public void setOnItemClickListener(MyItemClickListener listener) {
        this.mItemClickListener = listener;

    }

    public interface MyItemClickListener{

        void onItemClick(View view, int postion);

    }
}



