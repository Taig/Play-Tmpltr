package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	wbr[A <: wbr[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "wbr", attributes, content )