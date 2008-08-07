/**
 * License: GPL
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License 2
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * @author Stephan Saalfeld <saalfeld@mpi-cbg.de>
 *
 */
package mpicbg.models;

import java.lang.Exception;

/**
 * Signalizes that there were not enough data points available to estimate the
 * {@link Model}.
 * 
 */
public class IllDefinedDataPointsException extends Exception
{
	private static final long serialVersionUID = -8384893194524443449L;

	public IllDefinedDataPointsException()
	{
		super( "The set of data points is ill defined.  No Model could be solved." );
	}
	
	
	public IllDefinedDataPointsException( String message )
	{
		super( message );
	}
	
	
	public IllDefinedDataPointsException( Throwable cause )
	{
		super( cause );
	}
	
	
	public IllDefinedDataPointsException( String message, Throwable cause )
	{
		super( message, cause );
	}
}
