package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.TaobaoResponse;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.topats.jushita.jdp.datadelete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopatsJushitaJdpDatadeleteResponse extends TaobaoResponse
{
    
    private static final long serialVersionUID = 3169172347133824645L;
    
    /** 
     * result
     */
    @ApiField("result")
    private ResultDo result;
    
    public void setResult(ResultDo result)
    {
        this.result = result;
    }
    
    public ResultDo getResult()
    {
        return this.result;
    }
    
    /**
    * result
    *
    * @author top auto create
    * @since 1.0, null
    */
    public static class ResultDo extends TaobaoObject
    {
        
        private static final long serialVersionUID = 2386671713848373199L;
        
        /**
        	 * errCode
        	 */
        @ApiField("err_code")
        private String errCode;
        /**
         * errTrace
         */
        @ApiField("err_trace")
        private String errTrace;
        /**
         * result
         */
        @ApiField("result")
        private String result;
        
        public String getErrCode()
        {
            return this.errCode;
        }
        
        public void setErrCode(String errCode)
        {
            this.errCode = errCode;
        }
        
        public String getErrTrace()
        {
            return this.errTrace;
        }
        
        public void setErrTrace(String errTrace)
        {
            this.errTrace = errTrace;
        }
        
        public String getResult()
        {
            return this.result;
        }
        
        public void setResult(String result)
        {
            this.result = result;
        }
        
        public void setResultString(String result)
        {
            this.result = result;
        }
        
    }
    
}
