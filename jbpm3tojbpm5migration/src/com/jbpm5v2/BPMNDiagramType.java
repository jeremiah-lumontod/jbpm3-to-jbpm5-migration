////////////////////////////////////////////////////////////////////////
//
// BPMNDiagramType.java
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


public class BPMNDiagramType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5v2.jbpm5v2_TypeInfo.binder.getTypes()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_ti_altova_BPMNDiagramType]); }
	
	public BPMNDiagramType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{

		BPMNPlane= new MemberElement_BPMNPlane (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_BPMNDiagramType._BPMNPlane]);
	}
	// Attributes


	// Elements
	
	public MemberElement_BPMNPlane BPMNPlane;

		public static class MemberElement_BPMNPlane
		{
			public static class MemberElement_BPMNPlane_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_BPMNPlane member;
				public MemberElement_BPMNPlane_Iterator(MemberElement_BPMNPlane member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					BPMNPlaneType nx = new BPMNPlaneType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_BPMNPlane (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public BPMNPlaneType at(int index) {return new BPMNPlaneType(owner.getElementAt(info, index));}
			public BPMNPlaneType first() {return new BPMNPlaneType(owner.getElementFirst(info));}
			public BPMNPlaneType last(){return new BPMNPlaneType(owner.getElementLast(info));}
			public BPMNPlaneType append(){return new BPMNPlaneType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_BPMNPlane_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
