/*
* JBoss, Home of Professional Open Source
* Copyright 2012, Red Hat, Inc. and/or its affiliates, and individual
* contributors by the @authors tag. See the copyright.txt in the 
* distribution for a full listing of individual contributors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,  
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.jboss.as.quickstart.cdi.extension.test;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

import org.jboss.as.quickstart.cdi.parameterlogger.model.ParameterLog;

@ApplicationScoped
@Alternative
public class TestableParameterLog extends ParameterLog {
    
    private List<String> log = new ArrayList<String>();
    
    @Override
    public void info(String message) {
        log.add(message);
        super.info(message);
    }
    
    public void clear() {
        log.clear();
    }
    
    public boolean contains(String s) {
        return log.contains(s);
    }

}
