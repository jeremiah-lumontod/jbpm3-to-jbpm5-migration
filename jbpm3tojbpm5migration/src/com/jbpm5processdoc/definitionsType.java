////////////////////////////////////////////////////////////////////////
//
// definitionsType.java
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

package com.jbpm5processdoc;


public class definitionsType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getTypes()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_ti_altova_definitionsType]); }
	
	public definitionsType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{

		process= new MemberElement_process (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_definitionsType._process]);
		BPMNDiagram= new MemberElement_BPMNDiagram (this, com.jbpm5processdoc.jbpm5processdoc_TypeInfo.binder.getMembers()[com.jbpm5processdoc.jbpm5processdoc_TypeInfo._altova_mi_altova_definitionsType._BPMNDiagram]);
	}
	// Attributes


	// Elements
	
	public MemberElement_process process;

		public static class MemberElement_process
		{
			public static class MemberElement_process_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_process member;
				public MemberElement_process_Iterator(MemberElement_process member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					processType nx = new processType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_process (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public processType at(int index) {return new processType(owner.getElementAt(info, index));}
			public processType first() {return new processType(owner.getElementFirst(info));}
			public processType last(){return new processType(owner.getElementLast(info));}
			public processType append(){return new processType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_process_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
	
	public MemberElement_BPMNDiagram BPMNDiagram;

		public static class MemberElement_BPMNDiagram
		{
			public static class MemberElement_BPMNDiagram_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_BPMNDiagram member;
				public MemberElement_BPMNDiagram_Iterator(MemberElement_BPMNDiagram member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
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
					BPMNDiagramType nx = new BPMNDiagramType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_BPMNDiagram (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public BPMNDiagramType at(int index) {return new BPMNDiagramType(owner.getElementAt(info, index));}
			public BPMNDiagramType first() {return new BPMNDiagramType(owner.getElementFirst(info));}
			public BPMNDiagramType last(){return new BPMNDiagramType(owner.getElementLast(info));}
			public BPMNDiagramType append(){return new BPMNDiagramType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_BPMNDiagram_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
