////////////////////////////////////////////////////////////////////////
//
// BPMNShapeType.java
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


public class BPMNShapeType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5v2.jbpm5v2_TypeInfo.binder.getTypes()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_ti_altova_BPMNShapeType]); }
	
	public BPMNShapeType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{
		bpmnElement = new MemberAttribute_bpmnElement (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_BPMNShapeType._bpmnElement]);

		Bounds= new MemberElement_Bounds (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_BPMNShapeType._Bounds]);
	}
	// Attributes
	public MemberAttribute_bpmnElement bpmnElement;
		public static class MemberAttribute_bpmnElement
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_bpmnElement (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}


	// Elements
	
	public MemberElement_Bounds Bounds;

		public static class MemberElement_Bounds
		{
			public static class MemberElement_Bounds_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_Bounds member;
				public MemberElement_Bounds_Iterator(MemberElement_Bounds member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					BoundsType nx = new BoundsType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_Bounds (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public BoundsType at(int index) {return new BoundsType(owner.getElementAt(info, index));}
			public BoundsType first() {return new BoundsType(owner.getElementFirst(info));}
			public BoundsType last(){return new BoundsType(owner.getElementLast(info));}
			public BoundsType append(){return new BoundsType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_Bounds_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
