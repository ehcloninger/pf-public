/*
Copyright 2013 Eric H. Cloninger, dba PurpleFoto
 
Licensed under the Apache License, Version 2.0 (the "License"); you 
may not use this file except in compliance with the License. You may 
obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
implied. See the License for the specific language governing 
permissions and limitations under the License
 */

package com.purplefoto.pfdock;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public class OpenSourceDialogPreference extends DialogPreference {

    public OpenSourceDialogPreference (Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    protected View onCreateDialogView() {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.opensource, null);

        return view;        
    }	
} 

