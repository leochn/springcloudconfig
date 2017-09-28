
先加载 bootstrap.* 里面的配置  ---> 链接Config Server, 然后加载远程配置  
--->  加载application.* 里面的配置


在远程仓库中有profile，在application.yml中也有profile，会取到远程仓库中的profile。




## 手动刷新git仓库的配置
@RefreshScope
确保windows中能执行curl命令,然后执行: curl -X POST http://localhost:9114/refresh
返回错误信息:
```
$ curl -X POST http://localhost:9114/refresh
{
	"timestamp":1506560089374,
	"status":401,
	"error":"Unauthorized",
	"message":"Full authentication is required to access this resource.",
	"path":"/refresh"
}
```
则需要在配置文件bootstrap.yml中新增：
```
management.security.enabled=false  #忽略权限拦截,默认为true
```


再次执行 curl -X POST http://localhost:9114/refresh
返回正确信息:
```
$ curl -X POST http://localhost:9114/refresh
["config.client.version","profile"]
```












