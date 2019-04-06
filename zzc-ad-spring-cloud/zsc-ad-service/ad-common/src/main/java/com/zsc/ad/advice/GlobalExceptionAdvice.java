package com.zsc.ad.advice;

import com.zsc.ad.exception.AdException;
import com.zsc.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

public class GlobalExceptionAdvice {

    /**
     * 通知Spring需要处理AdException异常,指定处理AdException
     *
     * @param req
     * @param ex
     * @return
     */
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req,
                                                     AdException ex) {
        CommonResponse<String> response = new CommonResponse<>(-1,
                "bussiness error");
        response.setData(ex.getMessage());
        return response;
    }
}
