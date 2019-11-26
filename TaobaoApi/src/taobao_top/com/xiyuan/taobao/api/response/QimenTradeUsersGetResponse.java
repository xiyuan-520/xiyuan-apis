package com.xiyuan.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.trade.users.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenTradeUsersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2768665838694122281L;

	/** 
	 * totalCount
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * modal
	 */
	@ApiListField("users")
	@ApiField("qimen_user")
	private List<QimenUser> users;


	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setUsers(List<QimenUser> users) {
		this.users = users;
	}
	public List<QimenUser> getUsers( ) {
		return this.users;
	}
	
	/**
 * modal
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class QimenUser extends TaobaoObject {

	private static final long serialVersionUID = 7627497995189339719L;

	/**
		 * gmtCreate
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * memo
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * sellerNick
		 */
		@ApiField("seller_nick")
		private String sellerNick;
	

	public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}

}



}
