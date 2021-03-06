/**
 *
 */
package com.fijo.boot.util.encrypt;

import com.fijo.boot.base.exception.Exceptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 用途：对URL进行编码解密工具类
 * 作者: zhangbo
 * 时间: 2017/12/29  17:16 
 */
@Slf4j
@Component
public class UrlEncryptor extends AbstractEncryptor {

    public static void main(String[] args) {
        UrlEncryptor encryptor = new UrlEncryptor();
        log.debug(encryptor.encrypt("a291c2hhb2d1bw=="));
        log.debug(encryptor.decrypt(encryptor.encrypt("a291c2hhb2d1bw==")));
    }

    /**
     * 加密，编码默认为UTF-8
     * @param source 原值
     * @return 编码
     */
    @Override
    protected String encryptSource(String source) {
        try {
            return URLEncoder.encode(source, DEFAULT_URL_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 加密
     * @param source 原值
     * @param encoding 字符集
     * @return 加密值
     */
    public String encrypt(String source, String encoding) {
        try {
            return URLEncoder.encode(source, encoding);
        } catch (UnsupportedEncodingException e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 解密
     * @param code 编码默认为UTF-8
     * @return 解密值
     */
    @Override
    protected String decryptCode(String code) {

        try {
            return URLDecoder.decode(code, DEFAULT_URL_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 解密
     * @param code 编码
     * @param encoding 字符集
     * @return 解密值
     */
    public static String decrypt(String code, String encoding) {

        try {
            return URLDecoder.decode(code, encoding);
        } catch (UnsupportedEncodingException e) {
            throw Exceptions.unchecked(e);
        }
    }
}
