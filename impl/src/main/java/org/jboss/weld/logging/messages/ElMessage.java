/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.jboss.weld.logging.messages;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;
import org.jboss.weld.logging.MessageId;

@BaseName("org.jboss.weld.messages.el")
@LocaleData({
        @Locale("en")
})
/**
 * Log messages for EL resolution.
 *
 * Message IDs: 001000 - 001099
 *
 * @author David Allen
 *
 */
public enum ElMessage {
    @MessageId("001000")RESOLUTION_ERROR,
    @MessageId("001001")NULL_EXPRESSION_FACTORY,
    @MessageId("001002")PROPERTY_LOOKUP,
    @MessageId("001003")PROPERTY_RESOLVED;
}
