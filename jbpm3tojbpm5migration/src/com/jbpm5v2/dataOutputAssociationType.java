////////////////////////////////////////////////////////////////////////
//
// dataOutputAssociationType.java
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


public class dataOutputAssociationType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5v2.jbpm5v2_TypeInfo.binder.getTypes()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_ti_altova_dataOutputAssociationType]); }
	
	public dataOutputAssociationType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{

		sourceRef= new MemberElement_sourceRef (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_dataOutputAssociationType._sourceRef]);
		targetRef= new MemberElement_targetRef (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_dataOutputAssociationType._targetRef]);
	}
	// Attributes


	// Elements
	
	public MemberElement_sourceRef sourceRef;

		public static class MemberElement_sourceRef
		{
			public static class MemberElement_sourceRef_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_sourceRef member;
				public MemberElement_sourceRef_Iterator(MemberElement_sourceRef member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					sourceRefType nx = new sourceRefType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_sourceRef (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public sourceRefType at(int index) {return new sourceRefType(owner.getElementAt(info, index));}
			public sourceRefType first() {return new sourceRefType(owner.getElementFirst(info));}
			public sourceRefType last(){return new sourceRefType(owner.getElementLast(info));}
			public sourceRefType append(){return new sourceRefType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_sourceRef_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_targetRef targetRef;

		public static class MemberElement_targetRef
		{
			public static class MemberElement_targetRef_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_targetRef member;
				public MemberElement_targetRef_Iterator(MemberElement_targetRef member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					targetRefType nx = new targetRefType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_targetRef (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public targetRefType at(int index) {return new targetRefType(owner.getElementAt(info, index));}
			public targetRefType first() {return new targetRefType(owner.getElementFirst(info));}
			public targetRefType last(){return new targetRefType(owner.getElementLast(info));}
			public targetRefType append(){return new targetRefType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_targetRef_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
