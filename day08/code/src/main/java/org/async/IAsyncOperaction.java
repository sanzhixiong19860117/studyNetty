package org.async;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 19:45
 * 异步操作接口
 */
public interface IAsyncOperaction {
    /**
     * 获取绑定id
     *
     * @return
     */
    default int getBindId() {
        return 0;
    }

    /**
     * 获取异步操作
     */
    void doAsync();

    /**
     * 指定完成逻辑
     */
    default void doFinish() {
    }
}
