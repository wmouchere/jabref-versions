/*  Copyright (C) 2003-2011 JabRef contributors.
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/
package net.sf.jabref.exporter.layout.format;

import net.sf.jabref.exporter.layout.LayoutFormatter;
import net.sf.jabref.model.entry.AuthorList;

/**
 * Natbib style: Last names only. Two authors are separated by "and",
 * three or more authors are given as "Smith et al."
 *
 * @author Morten O. Alver
 */
public class AuthorNatBib implements LayoutFormatter {

    @Override
    public String format(String fieldText) {
        return AuthorList.fixAuthor_Natbib(fieldText);
    }
}
