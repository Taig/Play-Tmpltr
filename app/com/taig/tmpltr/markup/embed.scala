package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	embed[A <: embed[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "embed", attributes, content )