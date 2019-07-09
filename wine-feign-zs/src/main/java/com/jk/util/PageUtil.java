package com.jk.util;

import java.util.List;

/**
 * 鎺ュ彈鍒嗛〉鍙傛暟
 * @author yaoli
 *
 */
public class PageUtil {
	
	// 姣忛〉澶氬皯鏉�
	private Integer pageCount = 2;
	//褰撳墠绗嚑椤�
	private Integer currentPage = 1;
	
	// 鐢ㄦ潵瀛� 鏌ュ嚭鐨勫綋椤垫暟鎹�
	private List list;
	
	// 鎬绘潯鏁�
	private Integer sumSize;
	
	// 鎬婚〉鏁�
	private Integer sumPage;
	
	
	
	
	public Integer getSumSize() {
		return sumSize;
	}
	public void setSumSize(Integer sumSize) {
		this.sumSize = sumSize;
	}
	public Integer getSumPage() {
		return sumPage;
	}
	public void setSumPage(Integer sumPage) {
		this.sumPage = sumPage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	
	       
	        /**
	         * 
	         * @param sumSize  鎬绘潯鏁�
	         * @param currentPage  褰撳墠椤垫暟
	         * @param pageCount  姣忛〉澶氬皯鏉�
	         */
			public PageUtil(Integer sumSize, Integer currentPage, Integer pageCount) {
				super();
				// 褰撳墠椤垫暟璧嬪��
				this.currentPage = currentPage == null ? 1 : currentPage ;
				// 姣忛〉鏉℃暟璧嬪��
				this.pageCount = pageCount == null ? 2 : pageCount ;
				// 姣忛〉鏉℃暟璧嬪��
				this.sumSize = sumSize <= 0 ? 1 : sumSize ;
				// 缁欐�婚〉鏁拌祴鍊�
				if(this.sumSize%this.pageCount==0){
					this.sumPage = this.sumSize/this.pageCount;
				}else{
					this.sumPage = this.sumSize/this.pageCount+1;
				}
				
				// 褰撳墠椤垫暟涓嶅彲鑳藉ぇ浜庢�婚〉鏁帮紝濡傛灉澶т簬灏辩粰涓渶澶ч〉鏁�
				if(this.currentPage > this.sumPage){
					this.currentPage = this.sumPage;
				}
				// 褰撳墠椤垫暟涓嶅彲鑳藉皬浜�1椤碉紝濡傛灉灏忎簬1椤靛氨缁欓椤�
				if(this.currentPage < 1 ){
					this.currentPage = 1;
				}

			}
			
			//鍒嗛〉鏂规硶锛氳缃捣濮嬫潯鏁�
			public Integer getFirstResultCount(){
				
				Integer firstResultCount = ( getCurrentPage() - 1 ) * getPageCount();
				
				return firstResultCount;
			}
			   
			public PageUtil() {
				super();
			
			}
			
	

}
