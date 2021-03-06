// ======================================
// Project Name:core
// Package Name:cn.meddb.core.util
// File Name:IDataBufferHandler.java
// Create Date:2017年03月29日  14:56
// ======================================
package cn.meddb.core.util;

import cn.meddb.core.model.IPageInfo;
import cn.meddb.core.model.ISearchBean;

/**
 * @author 李旭光
 * @version 2017年03月29日  14:56
 */

public interface IDataBufferHandler<T> {
    /**
     * 取得下一批数据
     *
     * @param searchBean ISearchBean
     * @param pageInfo   IPageInfo<T>
     * @return IPageInfo<T>
     */
    IPageInfo<T> getNextList(ISearchBean searchBean,
                             IPageInfo<T> pageInfo);
}