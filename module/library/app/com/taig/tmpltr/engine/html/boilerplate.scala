package com.taig.tmpltr.engine.html

import com.taig.tmpltr.Attributes

import play.api.templates.Html

import scala.xml.NodeSeq

class	boilerplate( head: (Attributes, Html), body: (Attributes, Html), attributes: Attributes )
extends NodeSeq
{
	val theSeq = null

	override def toString =
		doctype() + "\n" +
		new html( attributes )( Html(
			new head( head._1 )( head._2 ) + "\n" +
			new body( body._1 )( body._2 ) ) )
}

object boilerplate
{
	def apply( head: (Attributes, Html) )( body: (Attributes, Html), attributes: (String, String)* ): boilerplate =
	{
		new boilerplate( head, body, attributes )
	}
}