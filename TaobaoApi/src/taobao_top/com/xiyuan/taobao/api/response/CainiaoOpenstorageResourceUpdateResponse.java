package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.TaobaoResponse;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: cainiao.openstorage.resource.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageResourceUpdateResponse extends TaobaoResponse
{
    
    private static final long serialVersionUID = 3627374334272736124L;
    
    /** 
     * result
     */
    @ApiField("result")
    private CloudPrintBaseResult result;
    
    public void setResult(CloudPrintBaseResult result)
    {
        this.result = result;
    }
    
    public CloudPrintBaseResult getResult()
    {
        return this.result;
    }
    
    /**
    * result
    *
    * @author top auto create
    * @since 1.0, null
    */
    public static class CloudPrintBaseResult extends TaobaoObject
    {
        
        private static final long serialVersionUID = 1528154488223117524L;
        
        /**
        	 * data
        	 */
        @ApiField("data")
        private String data;
        /**
         * errorCode
         */
        @ApiField("error_code")
        private String errorCode;
        /**
         * errorMessage
         */
        @ApiField("error_message")
        private String errorMessage;
        /**
         * success
         */
        @ApiField("success")
        private Boolean success;
        
        public String getData()
        {
            return this.data;
        }
        
        public void setData(String data)
        {
            this.data = data;
        }
        
        public void setDataString(String data)
        {
            this.data = data;
        }
        
        public String getErrorCode()
        {
            return this.errorCode;
        }
        
        public void setErrorCode(String errorCode)
        {
            this.errorCode = errorCode;
        }
        
        public String getErrorMessage()
        {
            return this.errorMessage;
        }
        
        public void setErrorMessage(String errorMessage)
        {
            this.errorMessage = errorMessage;
        }
        
        public Boolean getSuccess()
        {
            return this.success;
        }
        
        public void setSuccess(Boolean success)
        {
            this.success = success;
        }
        
    }
    
}
