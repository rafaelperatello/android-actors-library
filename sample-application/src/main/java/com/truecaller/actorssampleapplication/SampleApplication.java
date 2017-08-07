/*
 * Copyright (C) 2017 True Software Scandinavia AB
 *
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
 */

package com.truecaller.actorssampleapplication;

import android.app.Application;
import android.content.Context;

public class SampleApplication extends Application {

    private static ObjectsGraph sGraph;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        sGraph = DaggerObjectsGraph.builder().appModule(new AppModule(this)).build();
    }

    static ObjectsGraph graph() {
        return sGraph;
    }
}
