package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016101100663984";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCJPIkeufOEi1Bryx4DqNNzSF67Dxzxxu/avGtWu133cODuagXXKAzMQcaFWYJbWmuMWvuhl9ZN+ePKrWXd8ALhSYKWjle6omgi2OsULPzCX7Tvqfm1oyzWVz0pQZJzj7WR3TokZz+rbygmcdeXrZznVhvpCjj65qRjIvTjod6aasZhDEtWG5MZLXyGAu6525SAqe3UuZAt2GjBjY4EBQwmCyjYVjba4Xhuj9bq089vh0i415X99QEQqcT4FCPan1yu/7oPGJ8bLio9D9B8+x0hE+WrcXiZkADyQnTxZtzdIATKoEOzBkgoBo9+fqC+2Sgw5EAKwuTki08t7TRwUZUHAgMBAAECggEAOL3vz+WAm0fiy37i/Q5bxymgCWW5SPpBB8ap9uVnd7yTM+BgY9JqYDW9+DrHHDBpkVG5Ato9wGXW2mERYk8vUajMNqXJ/h/SQL5BjEkBhPh/XiyAU6qRClptrlYvUFqV7yZyOMT73U0LY8HkKxGcc0X2KkeQwaSFSXwVltzBpkRuWLHaNgCw3dhqmAizxbl0mRZzQdGcG80btUSDyLteMrIkBodFS5vwgwe9twdnCZesj37g5FKogR+5ToBkeQZN2hNl6fEFteOoCZh/DhCzZ/cZ6PiwLdope6PUWMkzw9qOdRZzvzoOzBA/nEo/NETOkOdZeKfSVJF3nHro7r4G0QKBgQDGrkbSrPVVezWnUKGluAkyXnGHs7yG1v+0IMTPZ7jj2kmiPbQrxplJTCja4A+sGXY8UzWtohRbZKa0dEh/0t2UPgVnNJx8dcWCc1+Sp8ryY5GUbxivROx3VadybHWIjtDg+KictDNXyS3xZeFtfIG4ZvLdgoPvTHKX3bbjHx3g3wKBgQCw1D38K/+tVEPhoyEZtW1F0HOOYd2uR6v1DBsqF8aA83cqtf/s1rqhZxVhDEH88210EDG25izEgsCdqxwKIDzWnlVGdH/Suu+wly+xMP4BaRJTzgWxo/ndslw4u6Ea5IWhYaCmx/kxGpjBWWqE2klGwF+T1FVqkeQ0dyP8SukI2QKBgQC1+H8jjIhzj5K3uREk0GeT+45uJQAiXB79Yxn/gNeF0bOpZmxzv8U7rgapWZjhHrz9SZUbgBy3DHvnQa35bS/HC/s06Kn/EHsjHPrHPumRkgKPeiWYuj7+mbPxCEeqGGxV8Um1pRJ1b+ylcZPEDMpfE+OTYGvorBM05zwPz7s07wKBgBEtLLA4HefaTZW3YNm8c9baPr9P5latg5iUCnd2Q8P24lZ1w1xgJ1TSTJNWu3o0sycZA5s+lI6qHMez/U9GfmJikun7Gwd/PRUsOme92I6OhEc7tfXhdb4BO1APecDA/fIFJ7PLrPsGGFx/sQcipQeIXEBh2cI2VbJ6+DXjmOtRAoGBAMUo/iNO4TgKV8fJJyA9aLpeF66bLkByvAQIY/47Fuo1uBohgMss8mSgcAAom38VFp36+EZG6POfuSuIVSnuWjnfuWjwrFsR92/inMWsNy3SZqkTZCekvmhzdBcHiVaeWZRqFv9+mkHDj+HYCdIgD1yhuqlu9X0Sl8j7MBO7w0KL";
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
