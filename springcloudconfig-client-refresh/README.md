
先加载 bootstrap.* 里面的配置  ---> 链接Config Server, 然后加载远程配置  
--->  加载application.* 里面的配置


在远程仓库中有profile，在application.yml中也有profile，会取到远程仓库中的profile。




手动刷新git仓库的配置
@RefreshScope
执行: curl -X POST "http://localhost:9114/refresh" 
["config.client.version","profile"]
