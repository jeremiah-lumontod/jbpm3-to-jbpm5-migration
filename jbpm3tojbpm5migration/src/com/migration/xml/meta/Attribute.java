// Attribute.java 
// This file contains generated code and will be overwritten when you rerun code refrigeration.

package com.migration.xml.meta;

public class Attribute
{
	private com.migration.typeinfo.MemberInfo memberInfo;
	
	public Attribute(com.migration.typeinfo.MemberInfo memberInfo)
	{
		this.memberInfo = memberInfo;
	}
	
	public boolean isRequired()
	{
		return memberInfo.getMinOccurs() > 0;
	}
	
	public String getLocalName()
	{
		return memberInfo.getLocalName();
	}
	
	public String getNamespaceURI()
	{
		return memberInfo.getNamespaceURI();
	}
	
	public SimpleType getDataType()
	{
		return new SimpleType(memberInfo.getDataType());
	}
}