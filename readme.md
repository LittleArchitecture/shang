# 1.项目描述
项目架构实践

# 2.项目组织结构
``` 
shang
├──shang-common         -- 公用组件
├──shang-parent         -- 父项目
├──shang-sys-facade     -- sys服务门面
├──shang-sys-service    -- sys服务提供者
├──shang-sys            -- sys消费者
```

# 3.项目模块图


# 4.开发环境
		* jdk1.7
		* idea 2017.1.4
		* maven
		
# 5.服务器规划

## 192.168.222
>		* java
			* 路径：/usr/local/jdk1.8.0_131
			* vi /etc/profile
				* JAVA_HOME=/usr/local/jdk1.8.0_131
				* CLASSPATH=.:$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH
				* PATH=$JAVA_HOME/bin:$PATH
				* export JAVA_HOME CLASSPATH PATH
		* maven
			* export MAVEN_HOME=/usr/local/apache-maven-3.0.4
		* jinkins
			* export JENKINS_HOME=/usr/local/JenkinsHome
			* 路径：/usr/local/jenkins-tomcat
			* 访问路径：http://192.168.1.222:7070/jenkins
			* 用户名密码:nickshang 123456
		* nexus
			* 路径：
				* /usr/local/soft/nexus-2.11.1-01/bin
			* 启动：
				* nexus start
			* 用户名、密码：
				* admin/admin123
			* 启动检查
				* /usr/local/nexus/nexus-2.11.1-01/bin/nexus console
			* 上传oracle 12 ,double 2.8.4 驱动包
		* zookeeper  
		    * 路径：/usr/local/zookeeper-3.4.5/bin
		    * 修改配置： cp zoo_sample.cfg zoo.cfg
		    *   dataDir=/Users/zdandljb/zookeeper/data
            *   dataLogDir=/Users/zdandljb/zookeeper/dataLog  
		    * 启动 ：zkServer.sh start
		* 服务部署
			* 路径：/usr/local/workspace/sys-service
			* 启动路径：/usr/local/workspace/sys-service/sys-service.sh
		
			
## 192.168.223

## 192.168.224


