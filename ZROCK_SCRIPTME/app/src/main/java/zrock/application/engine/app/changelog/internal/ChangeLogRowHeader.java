/*******************************************************************************
 * Copyright (c) 2013 Gabriele Mariotti.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package zrock.application.engine.app.changelog.internal;

import zrock.application.scriptme.R;

/**
 * ChangeLogRow model for a headerRow
 *
 * @author Gabriele Mariotti (gabri.mariotti@gmail.com)
 */
public class ChangeLogRowHeader extends ChangeLogRow{

    //-----------------------------------------------------------------------
    // Constructors
    //-----------------------------------------------------------------------

    public ChangeLogRowHeader(){
        super();
        setHeader(true);
        setBulletedList(false);
        setChangeTextTitle(null);
    }

    //-----------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("header="+super.header);
        sb.append(",");
        sb.append("versionName="+versionName);
        sb.append(",");
        sb.append("changeDate="+changeDate);

        return sb.toString();
    }

}