////////////////////////////////////////////////////////////////////////
//
// sourceRefType.java
//
// This file was generated by XMLSpy 2009sp1 Enterprise Edition.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the XMLSpy Documentation for further details.
// http://www.altova.com/xmlspy
//
////////////////////////////////////////////////////////////////////////

package com.jbpm5v2;


public class sourceRefType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5v2.jbpm5v2_TypeInfo.binder.getTypes()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_ti_altova_sourceRefType]); }
	
	public sourceRefType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{

	}
	// Attributes
	public String getValue() 
	{ 
		com.migration.typeinfo.MemberInfo member = com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_sourceRefType._unnamed];
		return (String)com.migration.xml.XmlTreeOperations.castToString(getNode(), member);
	}
	
	public void setValue(String value)
	{
		com.migration.typeinfo.MemberInfo member = com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_sourceRefType._unnamed];
		com.migration.xml.XmlTreeOperations.setValue(getNode(), member, value);
	}
	


	// Elements

		public void setXsiType() {com.migration.xml.XmlTreeOperations.setAttribute(getNode(), "http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "http://www.w3.org/2001/XMLSchema", "anySimpleType");}
}
