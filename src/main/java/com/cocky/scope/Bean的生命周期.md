1、Singleton：默认模式，全容器共享一个实例，一个Spring容器只有一个Bean的实例。
2、Prototype：每次调用新建一个Bean实例。
3、Request：Web项目中，给每一个http request新建一个Bean实例，
4、Session：Web项目中，给给每一http session新建一个Bean实例。
5、GlobalSession：这个只有portal应用中有用，给每一个global http session新建一个Bean实例。