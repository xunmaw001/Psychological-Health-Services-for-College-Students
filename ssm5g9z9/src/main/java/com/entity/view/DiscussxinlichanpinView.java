package com.entity.view;

import com.entity.DiscussxinlichanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 心理产品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 09:44:56
 */
@TableName("discussxinlichanpin")
public class DiscussxinlichanpinView  extends DiscussxinlichanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxinlichanpinView(){
	}
 
 	public DiscussxinlichanpinView(DiscussxinlichanpinEntity discussxinlichanpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussxinlichanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
