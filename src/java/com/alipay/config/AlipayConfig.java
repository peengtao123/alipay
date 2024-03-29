package com.alipay.config;

public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016101100663984";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDr89DhKn2Z3f65vlG0dG7O4S+Yq9QKEfWJE4ETiZZZLv9EwkOkHAWMB2aRR9kqy/+ZdSHzRkVXONMZuHFujTkEcZNv8A+QnE6LcVj/TJu3U8nXWjpadqDJGtilpoKqmi6Jioob3X/OVvUI4IV+3c/ovjO6mQt+PiLHnA6TjokD0b6ZZZImOE6cUruOI72W4QlmDK5AsC8Ss+OTdF8kbUP8PzSpLLu22Sx5E5yEJw8lC61o1nOiMatzjyAqxZtdPiJdojFNG4cLYKzmputD+TjAJe10DS09zWMlseyaZBHq10Pc6kfLPFMCAsGWM45aLO21i97ucD9pTbQ91mmt2NntAgMBAAECggEAfbCYwYlf9PoTuiBO5+DqMhw0vZAy2NZuRIH2TVEKnSFy687MN3yR2+EJWzS505lt4/JIjo4NXAQyN85P5oMmL17NGmD3+aG6GX/c18qYXJUuvSAcW5o71kUNyVgk3Ppa9futzGA2t9UMnJj1o/pGyYWgirMCM1KoNkrEXQgdpsErfacERSB0U6qxFT4XFbfaSq/rQXjDv9glDZJsO7iWCTFkX1gIHq1ppXJDNPwu/o1zxMu+3f5GH63MFAuQfwcZfyUpupFIlhvB0Ry7/PGNlSBBelKYKmS6HJ5BivyldfdGmMuuE9qRlx4djkzRueqseskIy71I27mfcvFgZqmlIQKBgQD2CqYIElZlyXAF6hylMSKG3O09VzBVTu1gK8IhjAIAE66Hsl6eIOlsxNI5nRJXbd4iCxDqrDAi9e6+49rBhpkFllwEjlY3Ms+t1lj21R6TcuwJWUdo1TesAIOVGlSMH59YLcJcsx398oQL2yvV/BuRP5hPw8bW1oSqU2YZmtjWGQKBgQD1gKDq6HG2V81bnWPgYfBYLTmXOUvWJwjoC1eBG8/S1DSuC0D0BlbRc2sVfLEfNQedueQ37ThYkgM6zWJM6OoNhEwwT5xZWLi2SQkNyQuRMnZNeX3R+1yQ8ClGCAqIb7/W+bj1E+eWsyztlv5N9DEnY5JBGha3VDl7C0qiN6oU9QKBgQDPSV1kQ37CtplIglqr2d+K26qMGV7BIIPgmD0v4jL1OZ+69027z2KZnqC2pVyEiC2zZLtV2sebTLNd472zeeCF0o2n0PtV+dr6TDIbkqX198ZggfUlny0OHki9X7eHbkTjF3o+ezFzd9RD4NznpUTcdEWwPfLRoV2X2jeUrt6sUQKBgQDPoVj3M12wrLOGrycgR1ShDqatagzkcqEKt0TrcZ0jnstrAyOM/quAew/u3UVjslLdp7EHR76m0d6fZcKkbzw78E8LcNk3i1y09jINEaKRy07YmU67P8562lLd4sEdwP1LkGpIA+ySvLjbvB8ZyNOlj4XLP4hExpvSn6sgZNmY3QKBgAHBPLsW1vHmTuLqO3R3IXUgQq7sXjDXAOtsXBwVBBQU6/4AXxJpLNX49H+Yu4kfewhBFA5I0w7BGFqNATUk3c3QpExrii9OvGoEGg96gqGdJqxj9ewCzZthT33VxaVTJ+ynhtIrrqXnJpgArT8J8Tu4r35j50jM1iSTghoqsE+c";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.91fox.cn/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://www.91fox.cn/return_url.jsp";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2UOoMFtUGbTt4N7+R/s6pLMeNPz0Xpy490cK9HRkq9TmSqDjD2FZNef48XxXRiH57sZIpDiqymcSycMX9h8gNESRQjMETjwaR6B7SVixC7/K3SIpGj5YtvHjLiiVnpcewnyygDkzWrxsUa/R+hedDtKg9FlIgBG+gaJYWetcL55AuonrmgWMHQCrDOKFR+9TOLajxHmH7Sf9ycuwww3ZU7e8MHMr0O11ELuxWzn/89wvNzI05943BpDZ61Fvd4bnbhobuAqnHQHBphLJCNxKobPN64VbpNsM6M9O1F//mK4wKggGxp/FLR55ScPi+lPoBdWUFbZjkN0PaTbapfICzQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
