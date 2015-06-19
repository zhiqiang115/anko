/*
 * Copyright 2015 JetBrains s.r.o.
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
 */

package org.jetbrains.android.anko.utils

fun String.toCamelCase(separator: Char = '_'): String {
    val builder = StringBuilder()
    var capitalFlag = true
    for (c in this) {
        when (c) {
            separator -> capitalFlag = true
            else -> {
                builder.append(if (capitalFlag) Character.toUpperCase(c) else Character.toLowerCase(c))
                capitalFlag = false
            }
        }
    }
    return builder.toString()
}