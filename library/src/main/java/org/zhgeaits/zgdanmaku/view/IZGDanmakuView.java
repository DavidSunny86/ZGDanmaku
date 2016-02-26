/*
 * Copyright (C) 2016 Zhang Ge <zhgeaits@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zhgeaits.zgdanmaku.view;

/**
 * Created by zhgeaits on 16/2/25.
 * 弹幕控件接口
 */
public interface IZGDanmakuView {

    /**
     * 启动
     */
    void start();

    /**
     * 停止
     */
    void stop();

    /**
     * 隐藏
     */
    void hide();

    /**
     * 显示
     */
    void show();

    /**
     * 暂停
     */
    void pause();

    /**
     * 重启
     */
    void resume();

    boolean isPause();

    boolean isHide();

    /**
     * 设置行数
     * @param lines
     */
    void setLines(int lines);

    /**
     * 设置行距
     * @param leading 单位dp
     */
    void setLeading(float leading);

    /**
     * 设置速度
     * @param speed 单位dp/s
     */
    void setSpeed(float speed);

    /**
     * 发送一条弹幕
     * @param text
     */
    void shotTextDanmamku(String text);
}