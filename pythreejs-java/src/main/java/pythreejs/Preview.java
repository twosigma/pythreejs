/*
 *  Copyright 2017 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *import static org.assertj.core.api.Assertions.assertThat;
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package pythreejs;

import java.io.Serializable;
import java.util.HashMap;

public class Preview extends RenderableWidget{


    private static final String VIEW_NAME_VALUE = "PreviewView";
    private static final String MODEL_NAME_VALUE = "PreviewModel";
    private static final String IPY_MODEL = "IPY_MODEL_";
    private final String FLAT = "_flat";
    private final String WIRE = "_wire";
    private final String CHILD = "child";

    private boolean flat = false;
    private boolean wire = false;
    private ThreeWidget child;

    public Preview(ThreeWidget child) {
        super();
        this.child = child;
        openComm();
    }

    @Override
    public HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
        super.content(content);
        content.put(FLAT, flat);
        content.put(WIRE, wire);
        content.put(CHILD, this.child == null ? null : IPY_MODEL + this.child.getComm().getCommId());
        return content;
    }

    public String getModelNameValue(){
        return MODEL_NAME_VALUE;
    }

    public String getViewNameValue(){
        return VIEW_NAME_VALUE;
    }

    public boolean getFlat() {
        return flat;
    }

    public void setFlat(boolean flat) {
        this.flat = flat;
        super.sendUpdate(FLAT, flat);
    }

    public boolean getWire() {
        return wire;
    }

    public void setWire(boolean wire) {
        this.wire = wire;
        super.sendUpdate(WIRE, wire);
    }

    public ThreeWidget getChild() {
        return child;
    }

    public void setChild(ThreeWidget child) {
        this.child = child;
        super.sendUpdate(CHILD, this.child.getComm().getCommId());
    }

}

