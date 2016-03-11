/*
        Copyright  DR.YangLong

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package org.apache.mycat.advisor.common.security.shiro.distribution.Jedis;


import org.apache.mycat.advisor.common.security.shiro.distribution.DistributeCacheFactory;

/**
 * shiroexample.common.shiro.distribution.Jedis
 * functional describe:Jedis缓存工厂类
 *
 * @author DR.YangLong [410357434@163.com]
 * @version 1.0 2015/4/13 15:46
 */
public class RedisCacheFactory implements DistributeCacheFactory {
    private static final String DEFAULT_JEDIS_CACHENAME = "JEDIS_CACHE";
    private String cacheName=DEFAULT_JEDIS_CACHENAME;

    public RedisCacheFactory(String cacheName) {
        this.cacheName = cacheName;
    }

    public <K, V> DistributeCache<K, V> getCache(String name) {
        return null;
    }

    public void destroy() {

    }
}