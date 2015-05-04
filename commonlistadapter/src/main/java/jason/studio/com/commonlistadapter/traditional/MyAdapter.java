package jason.studio.com.commonlistadapter.traditional;

import android.content.Context;
import android.widget.TextView;

import java.util.List;

import jason.studio.com.commonlistadapter.R;
import jason.studio.com.commonlistadapter.util.CommonAdapter;
import jason.studio.com.commonlistadapter.util.ViewHolder;

/**
 * Created by Raiking on 2015/4/19.
 */
public class MyAdapter extends CommonAdapter<Bean> {

    public MyAdapter(Context context, List<Bean> datas) {
        super(context, datas);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void inflateContent(ViewHolder holder, int position, Bean bean) {
//        ((TextView) holder.getView(R.id.textView1)).setText(bean.getTitle());
//        ((TextView) holder.getView(R.id.textView2)).setText(bean.getDesc());
        holder.setText(R.id.textView1, bean.getTitle()).setText(R.id.textView2, bean.getDesc());
        ((TextView) holder.getView(R.id.textView3)).setText(bean.getTime());
        ((TextView) holder.getView(R.id.textView4)).setText(bean.getPhone());
    }

    @Override
    public int setItemLayout() {
        return R.layout.item2;
    }
}
