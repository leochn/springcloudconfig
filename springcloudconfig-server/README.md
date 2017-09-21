
```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```


http://localhost:9110/abc-default.properties
http://localhost:9110/abc-default.yml

http://localhost:9110/foobar-dev.yml

http://localhost:9110/foobar-deddd.yml  --> 会命中到默认的文件 application.yml

http://localhost:9110/abc/default/master

http://localhost:9110/foobar/dev/master