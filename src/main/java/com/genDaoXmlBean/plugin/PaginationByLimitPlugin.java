package com.genDaoXmlBean.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
 * 自定义分页插件
 * 
 * @author shi_senlin
 *
 */
public class PaginationByLimitPlugin extends PluginAdapter {


	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		topLevelClass.setSuperClass("com.anso.db.AbstractPojo");
		//topLevelClass.addSuperInterface("java.io.Serializable");
		return super.modelExampleClassGenerated(topLevelClass,
				introspectedTable);
	}

	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement limitCheck = new XmlElement("choose");
		XmlElement when1 = new XmlElement("when");
		when1.addAttribute(new Attribute("test", "offset != null and offset >= 0 and limit != null"));
		when1.addElement(new TextElement("limit #{offset},#{limit}"));
		
		XmlElement when2 = new XmlElement("when");
		when2.addAttribute(new Attribute("test", "offset == null and limit != null"));
		when2.addElement(new TextElement("limit #{limit}"));
		limitCheck.addElement(when1);
		limitCheck.addElement(when2);
		
		element.addElement(limitCheck);
		return super.sqlMapSelectByExampleWithoutBLOBsElementGenerated(element,introspectedTable);
	}
	

	public boolean validate(List<String> arg0) {
		return true;
	}

}
