package jason.studio.com.commonlistadapter.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Jason on 2015/4/19.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected List<T> mData;
    protected LayoutInflater mInflater;

    public CommonAdapter(Context context, List<T> data) {
        this.mContext = context;
        this.mData = data;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public abstract long getItemId(int position);

    /**
     * 填充Item内容的方法，如设置TextView的text
     *
     * @param holder   返回可供用户调用的holder
     * @param position 当前的位置
     * @param t        元数据
     */
    public abstract void inflateContent(ViewHolder holder, int position, T t);

    /**
     * 设置Item的布局文件Id
     *
     * @return 布局文件Id
     */
    public abstract int setItemLayout();

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.getInstance(mContext, convertView, parent, setItemLayout(), position);
        inflateContent(holder, position, getItem(position));
        return holder.getConvertView();
    }
}
