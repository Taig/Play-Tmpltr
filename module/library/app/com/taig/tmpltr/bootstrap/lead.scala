package com.taig.tmpltr.bootstrap

import com.taig.tmpltr._
import play.api.templates.Html

class lead(attributes: Attributes)(content: Html) extends Tag.Html.Body.Paragraph[lead](
	attributes ++ ( "class" -> "lead" )
)( content )
{
	protected def copy = new lead( _: Attributes )( content )
}

object lead
{
	def apply(attributes: (String, String)*)(content: Html): lead = new lead( attributes )( content )

	def apply(content: Html): lead = apply( )( content )
}