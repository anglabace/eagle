/*
 * Copyright 2017 eagle.jfaster.org.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package eagle.jfaster.org.logging;

/**
 * Create by fangyanpeng 2017/08/13
 */
public class ConsoleLoggerFactory extends InternalLoggerFactory {

    public static final InternalLoggerFactory INSTANCE = new ConsoleLoggerFactory();

    private ConsoleLoggerFactory() {
    }

    @Override
    protected InternalLogger newInstance(String name) {
        return new ConsoleLogger(name);
    }

}
