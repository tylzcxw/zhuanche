package com.baidu.zhuanche.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baidu.zhuanche.R;
import com.baidu.zhuanche.base.MyBaseApdater;
import com.baidu.zhuanche.bean.CartTypeBean.LevelBean;
import com.baidu.zhuanche.utils.UIUtils;

/**
 * @项目名: 拼车
 * @包名: com.baidu.zhuanche.adapter
 * @类名: QuhaoAdapter
 * @创建者: 陈选文
 * @创建时间: 2015-12-26 下午4:18:38
 * @描述: 司机端通用对话框适配器
 * 
 * @svn版本: $Rev$
 * @更新人: $Author$
 * @更新时间: $Date$
 * @更新描述: TODO
 */
public class DialogDriverAdapter extends MyBaseApdater<LevelBean>
{

	public DialogDriverAdapter(Context context, List<LevelBean> dataSource) {
		super(context, dataSource);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		DialogDriverViewHolder holder = null;
		if (convertView == null)
		{
			holder = new DialogDriverViewHolder();
			convertView = View.inflate(UIUtils.getContext(), R.layout.item_dialog, null);
			convertView.setTag(holder);
			holder.tvName = (TextView) convertView.findViewById(R.id.item_tv_name);
		}
		else
		{
			holder = (DialogDriverViewHolder) convertView.getTag();
		}
		LevelBean bean = (LevelBean) getItem(position);
		holder.tvName.setText(bean.name);
		return convertView;
	}

}

class DialogDriverViewHolder
{
	TextView	tvName;
}