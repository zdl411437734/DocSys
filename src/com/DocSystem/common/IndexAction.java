package com.DocSystem.common;

import java.util.List;

import com.DocSystem.entity.Doc;

public class IndexAction{
    private Integer action;	//1:add 2:delete 3:update 4:move 5:copy
 
    private Integer indexType; //0:DocName 1:RealDoc 2:VirtualDoc
 
    private Doc doc = null;
    private Doc newDoc = null;	//This is for move/copy
    
    private String localRootPath;
    private String indexLib;
    
    //subAction
    public boolean isSubAction = false;
    //Sub Action List
    public boolean hasSubList = false;
    private List<IndexAction> subActionList = null;
	
	public void setAction(Integer action) {
		this.action = action;
	}
	
	public Integer getAction()
	{
		return action;
	}
	
	public void setIndexType(Integer indexType) {
		this.indexType = indexType;
	}
	
	public Integer getIndexType()
	{
		return indexType;
	}
	
	public void setDoc(Doc doc) {
		this.doc = doc;
	}
	
	public Doc getDoc()
	{
		return doc;
	}
	
	public void setNewDoc(Doc newDoc) {
		this.newDoc = newDoc;
	}
	
	public Doc getNewDoc()
	{
		return newDoc;
	}

	public void setLocalRootPath(String localRootPath) {
		this.localRootPath = localRootPath;
	}
	
	public String getLocalRootPath()
	{
		return localRootPath;
	}

	public void setIndexLib(String indexLib) {
		this.indexLib = indexLib;
	}
	
	public String getIndexLib()
	{
		return indexLib;
	}
	
	public boolean getHasSubList()
	{
		return hasSubList;
	}
	
	public void setHasSubList(boolean hasSubList) {
		this.hasSubList = hasSubList;
	}
	
	public void setSubActionList(List<IndexAction> subActionList) {
		this.subActionList = subActionList;
	}
	
	public List<IndexAction> getSubActionList()
	{
		return subActionList;
	}
	
}
