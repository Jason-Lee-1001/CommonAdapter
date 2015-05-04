package jason.studio.com.commonlistadapter.traditional;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import jason.studio.com.commonlistadapter.R;


public class MainActivity extends ActionBarActivity {

    private ListView mListView;
    private List<Bean> mDatas;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initView();

    }

    private void initView() {
        mListView = (ListView)this.findViewById(R.id.listview);
        mListView.setAdapter(mAdapter);
    }

    private void initDatas() {
        mDatas = new ArrayList<>();
        Bean bean1 = new Bean("标题1","描述1","时间1","10086");
        mDatas.add(bean1);
        Bean bean2 = new Bean("标题2","描述1","时间1","10086");
        mDatas.add(bean2);
        Bean bean3 = new Bean("标题3","描述1","时间1","10086");
        mDatas.add(bean3);
        Bean bean4 = new Bean("标题4","描述1","时间1","10086");
        mDatas.add(bean4);
        Bean bean5 = new Bean("标题5","描述1","时间1","10086");
        mDatas.add(bean5);
        Bean bean6 = new Bean("标题6","描述1","时间1","10086");
        mDatas.add(bean6);
        Bean bean7 = new Bean("标题7","描述1","时间1","10086");
        mDatas.add(bean7);
        Bean bean8 = new Bean("标题8","描述1","时间1","10086");
        mDatas.add(bean8);
        Bean bean9 = new Bean("标题9","描述1","时间1","10086");
        mDatas.add(bean9);
        Bean bean10= new Bean("标题10","描述1","时间1","10086");
        mDatas.add(bean10);
        Bean bean11= new Bean("标题11","描述1","时间1","10086");
        mDatas.add(bean11);
        mAdapter = new MyAdapter(this, mDatas);
    }
}
